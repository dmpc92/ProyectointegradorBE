package com.Car4All.Proyecto.service;


import com.Car4All.Proyecto.entity.dto.UsuarioDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.Car4All.Proyecto.entity.Usuario;
import com.Car4All.Proyecto.repository.UsuarioRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.List;
import java.util.Optional;
@Service
public class UsuarioService  /*implements UserDetailsService*/ {
    private static final Logger logger=  LogManager.getLogger(UsuarioService.class);
    @Autowired
    private ObjectMapper mapper;
    @Autowired
    private UsuarioRepository usuarioRepository;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Usuario guardarUsuario(UsuarioDTO usuario){
        logger.info("Se esta llevando a cabo el proceso de Guardar Usuario");
        Usuario usuario1 = mapper.convertValue(usuario, Usuario.class );
//        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
//        logger.info(usuario.getPassword());
        return usuarioRepository.save(usuario1);
    }
    public Usuario actualizarUsuario(UsuarioDTO usuario){
        logger.info("Se esta llevando a cabo el proceso de Actualizar Usuario");
        Usuario usuario1 = mapper.convertValue(usuario, Usuario.class );
//        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario1);
    }
    public void eliminarUsuario(Long id){
        logger.info("Se esta llevando a cabo el proceso de Eliminar Usuario");
        usuarioRepository.deleteById(id);
    }
    public Optional<Usuario> buscarPorId(Long id){
        logger.info("Se esta llevando a cabo el proceso de buscar Usuario por Id");
        return usuarioRepository.findById(id);
    }
    public List<Usuario> listarUsuarios(){
        logger.info("Se esta llevando a cabo el proceso de Listar Usuarios");
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> buscarPorEmail(String email){
        logger.info("Se esta llevando a cabo el proceso de buscar Usuario por Email");
        return usuarioRepository.findByEmail(email);
    }
    public Optional<Usuario> buscarPorNombreUsuario(String nombreUsuario){
        logger.info("Se esta llevando a cabo el proceso de buscar Usuario por Email");
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public UsuarioDTO convertirAUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setPassword(usuario.getPassword());
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setUsuarioRol(usuario.getUsuarioRol());
        return usuarioDTO;
    }

    public Usuario convertirAUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setNombreUsuario(usuarioDTO.getNombre());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setUsuarioRol(usuarioDTO.getUsuarioRol());
        usuario.setNombre(usuarioDTO.getNombre());
        return usuario;
    }
//    @Override
//    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
//        Optional<Usuario> usuarioOptional = usuarioRepository.findByNombreUsuario(nombreUsuario);
//        if (usuarioOptional.isEmpty()) {
//            throw new UsernameNotFoundException("Usuario no encontrado");
//        }
//        return  usuarioOptional.get();
//    }
}
