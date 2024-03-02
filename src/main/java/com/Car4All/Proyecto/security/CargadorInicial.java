package com.Car4All.Proyecto.security;

import com.Car4All.Proyecto.entity.Domicilio;
import com.Car4All.Proyecto.entity.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CargadorInicial implements ApplicationRunner {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private OdontologoRepository odontologoRepository;
    @Autowired
    private TurnoRepository turnoRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // crear un usuario
        // guardarlo en BDD
        //necesito password
        BCryptPasswordEncoder cifrador = new BCryptPasswordEncoder();
        String clave = cifrador.encode("digital");
        System.out.println("Clave cifrada: "+cifrador);
        Usuario usuario1= new Usuario("Ezequiel","ezequiel","ezequielbravo@digitalhouse.com",clave, UsuarioRol.ROLE_USER);
        usuarioRepository.save(usuario1);
        Usuario admin1= new Usuario("Vanesa","vanesa","vanesagarzon@digitalhouse.com",clave, UsuarioRol.ROLE_ADMIN);
        usuarioRepository.save(admin1);
        Paciente paciente1= new Paciente("Ezequiel" ,"Bravo","1234", LocalDate.of(2023,9,05),new Domicilio("calle 2",23,"Caleta Olivia","Santa Cruz"),"ezequielbravo@digitalhouse.com");
        pacienteRepository.save(paciente1);
        Odontologo odontologo1= new Odontologo("12345","Vanesa","Garzon");
        odontologoRepository.save(odontologo1);
        Turno turno1= new Turno(paciente1,odontologo1,LocalDate.of(2023,10,12));
        turnoRepository.save(turno1);

    }
}
