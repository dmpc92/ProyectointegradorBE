package com.Car4All.Proyecto.security;

import com.Car4All.Proyecto.entity.*;
import com.Car4All.Proyecto.repository.AutoRepository;
import com.Car4All.Proyecto.repository.CategoriaRepository;
import com.Car4All.Proyecto.repository.UsuarioRepository;
import com.Car4All.Proyecto.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import com.Car4All.Proyecto.repository.FavoritosRepository;

@Component
public class CargadorInicial implements ApplicationRunner {
    @Autowired
    private FavoritosRepository favoritosRepository;
    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private AutoRepository autoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        BCryptPasswordEncoder cifrador = new BCryptPasswordEncoder();
//        String clave = cifrador.encode("digital");
//        System.out.println("Clave cifrada: "+cifrador);
        Usuario usuario1= new Usuario("hola","ezequielbravo00@gmail.com",UsuarioRol.ROLE_USER,"Ezequiel");
        usuarioRepository.save(usuario1);
        Usuario usuario2= new Usuario("1234","nicolopezarq@gmail.com",UsuarioRol.ROLE_ADMIN,"Nicolas");
        usuarioRepository.save(usuario2);

  /*      AutoDTO auto1= new AutoDTO("Corolla 1.8 XEI Pack CVT","Toyota",5,"Manual","https://autos.hamariweb.com/images/carimages/BBCQG0U.jpg",4,3,50.00);
        autoRepository.save(auto1);
        Auto auto2= new Auto("Cronos","Fiat",5,"Nafta","Manual","Argentina",false,"GHR567",false,"https://garagem360.com.br/wp-content/uploads/2022/10/img-version-cronos-precision-13-at-2048x1306.png",4,2,55.00);
        autoRepository.save(auto2);
        Auto auto3= new Auto("F100","Ford",5,"GasOil","Manual","Argentina",false,"JTY564",false,"https://www.pngall.com/wp-content/uploads/5/Ford-Pickup-Truck.png",4,2,45.00);
        autoRepository.save(auto3);
        Auto auto4= new Auto("Carrera GTS","Porche",5,"Nafta","Manual","Argentina",false,"JKL123",false,"https://pluspng.com/img-png/porsche-car-png-image-2048.png",4,2,60.00);
        autoRepository.save(auto4);
        Auto auto5= new Auto("Cruze 1.4 LTZ AT","Chevrolet",5,"Nafta","Manual","Argentina",true,"FAF984",false,"https://pngimg.com/uploads/chevrolet/%D1%81hevrolet_PNG20.png",4,2,52.00);
        autoRepository.save(auto5);
        Auto auto6= new Auto("Hilux SRV 3.0 TDI Aut. 4X4","Toyota",5,"GasOil","Automatico","Argentina",false,"REW321",false,"http://toyotasalinacruz.com.mx/wp-content/uploads/2020/12/toyota-hilux-exterior.png",4,2,65.00);
        autoRepository.save(auto6);
        Auto auto7= new Auto("Elantra 2.0 GLS","Hyundai",5,"Nafta","Manual","Argentina",false,"HRW942",false,"https://pngimg.com/uploads/hyundai/hyundai_PNG11217.png",4,2,49.00);
        autoRepository.save(auto7);
        Auto auto8= new Auto("C 300 Kompressor","Mercedes Benz",4,"Nafta","Automatico","Argentina",false,"QWE123",false,"https://pngimg.com/uploads/mercedes/mercedes_PNG1870.png",4,2,46.00);
        autoRepository.save(auto8);
        Auto auto9= new Auto("208 1.0 Feline CVT","Peugeot",5,"Nafta","Automatica","Argentina",false,"ERH153",false,"https://www.autosphere.fr/assets/operation/LOA_208/2022-07/Peugeot-208.png",4,2,47.00);
        autoRepository.save(auto9);
        Auto auto10= new Auto("1500 Heavy Duty","Ram",5,"Nafta","Manual","Argentina",false,"ASD123",false,"https://purepng.com/public/uploads/large/purepng.com-ram-1500-rebel-mountain-cararramvehicletransportram-truckmountain-car-961524661504ioj7u.png",4,2,53.00);
        autoRepository.save(auto10);
        Auto auto11= new Auto("Grand Vitara 2.0 AWD","Suzuki",5,"GasOil","Manual","Argentina",false,"FGD987",false,"https://pngimg.com/uploads/pickup_truck/pickup_truck_PNG102880.png",5,4,50.00);
        autoRepository.save(auto11);
        Categoria categoria1 = new Categoria("Auto");
        categoriaRepository.save(categoria1);
        Categoria categoria2 = new Categoria("Camioneta");
        categoriaRepository.save(categoria2);
        Favoritos favoritos = new Favoritos();
        favoritos.getAutos().add(auto1);
        favoritosRepository.save(favoritos);
            */
//        categoriaService.agregarAutoACategoria(1L,1L);
//        categoriaService.agregarAutoACategoria(1L,2L);
//        categoriaService.agregarAutoACategoria(1L,3L);
//        categoriaService.agregarAutoACategoria(1L,4L);
//        categoriaService.agregarAutoACategoria(1L,5L);
//        categoriaService.agregarAutoACategoria(2L,6L);
//        categoriaService.agregarAutoACategoria(1L,7L);
//        Usuario admin1= new Usuario("Vanesa","vanesa","vanesagarzon@digitalhouse.com",clave, UsuarioRol.ROLE_ADMIN);
//        usuarioRepository.save(admin1);


    }
}
