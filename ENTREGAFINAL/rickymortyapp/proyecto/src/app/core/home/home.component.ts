import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'proyecto-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  secciones: string = "";
filtradas:any[]=[]
estilos:any []=[

 {
   imagen:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyCO8Fxzgytj3MhUoJ7n_bgq5yfd_NxGRR2VPnDuJgQ4E7A3_DeUnIKkIUDIlBF4c662A&usqp=CAU',
   categoria:"Estilo Gregoriano ",
   nombre:"Atenas",
  descripcion:"El interiorismo en Grecia,Si bien la típica arquitectura griega surgió hace miles de años con énfasis en creencias religiosas o mitos.Además, existe una continuidad del interior con el exterior, tanto que a veces no distinguimos uno del otro",
  fecha:"14/02/45"
},

{
  imagen:'https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2015/07/10/14365298520636.jpg',
  categoria:"Estilo Gregoriano",
  nombre:"Patras",
descripcion:"La grandeza y la amplitud de espacios son aspectos base del concepto de decoración griega. En los interiores griegos no existe el amontonamiento, sino la libre circulación, la comodidad y la sencillez, sin olvidar la presencia de adornos y elementos decorativos típicos de la cultura y las artes griegas.",
fecha:"08/12/2001"
},

{
  imagen:'https://image.urlaubspiraten.de/1024/image/upload/v1634210786/Impressions%20and%20Other%20Assets/calilo_1_hazn1q.png',
  categoria:"Estilo Gregoriano",
  nombre:"La Canea",
descripcion:"La iluminación tiene que ser amplia en todo sentido, por lo que es necesario potenciar la iluminación natural, aprovecharla a través de grandes ventanas, tragaluces, etc. Combinando este tipo de iluminación con la paleta de colores. lograrás grandes efectos. ",
fecha:"31/06/1995"
},

{
  imagen:'https://q-xx.bstatic.com/xdata/images/hotel/max500/331645769.jpg?k=4568a7b11d84ccb3d87cf387468497aea8dfab3dbdb733acdbbdc136b3a3944f&o=',
  categoria:"Estilo Gregoriano",
  nombre:"Salónica",
descripcion:"Los interiores estilo griego suelen tener formas redondeadas, con divisiones entre espacios a base de arcos y otras formas abovedadas. Si combinas luz y color con esta geometría espacial tendrás una acogedora casa al estilo griego.",
fecha:"21/08/2021"
},
{
  imagen:'https://m1.paperblog.com/i/202/2027700/casa-minimalista-madrid-L-lXIqZx.jpeg',
  categoria:"Estilo Minimalista",
  nombre:"Madrid",
 descripcion:"El estilo minimalista se basa en introducir el menor número posible de elementos para decorar una estancia. Es adecuado para personas que les gusta la tranquilidad y la simplicidad.Lo fundamental en este estilo es preservar el espacio en lugar de rellenarlo, como se hace en la decoración tradicional.",
 fecha:"14/02/1980"
},

{
 imagen:'https://www.arquitecturaydiseno.es/medio/2020/01/27/vista-exterior-de-la-vivienda-con-el-mar-de-fondo_2f6cf300_1500x930.jpg',
 categoria:"Estilo Minimalista",
 nombre:"Santander",
descripcion:"La grandeza y la amplitud de espacios son aspectos base del concepto de decoración griega. En los interiores griegos no existe el amontonamiento, sino la libre circulación, la comodidad y la sencillez, sin olvidar la presencia de adornos y elementos decorativos típicos de la cultura y las artes griegas.",
fecha:"08/12/2001"
},

{
 imagen:'http://planosdecasasmodernas.com/wp-content/uploads/2017/06/Casa-minimalista-fachada-una-planta.jpg',
 categoria:"Estilo Minimalista",
 nombre:"Valencia",
descripcion:"La iluminación tiene que ser amplia en todo sentido, por lo que es necesario potenciar la iluminación natural, aprovecharla a través de grandes ventanas, tragaluces, etc. Combinando este tipo de iluminación con la paleta de colores. lograrás grandes efectos. ",
fecha:"31/06/1995"
},

{
 imagen:'https://i.pinimg.com/originals/c2/d1/c8/c2d1c864a70f8fcf05af093c98a7eccd.jpg',
 categoria:"Estilo Minimalista",
 nombre:"Cádiz",
descripcion:"Los interiores estilo minimal su¿Qué es una casa estilo minimalista?Simplicidad en las formas y funciones: Las casas minimalistas se caracterizan por tener planos simples, con líneas bien definidas, logrando que existan espacios amplios y con colores bien definidos.elen tener formas redondeadas, con divisiones entre espacios a base de arcos y otras formas abovedadas. Si combinas luz y color con esta geometría espacial tendrás una acogedora casa al estilo griego.",
fecha:"21/08/2021"
},

{
  imagen:'https://img.remediosdigitales.com/b852fb/caravana/450_1000.jpeg',
  categoria:"Estilo Furgonetas",
  nombre:"camper",
 descripcion:"Nosotros consideramos que una camper (sin contar el vehículo), cuesta entre 15.000€ y 30.000€. Puede costar un poco menos, y puede costar un poco más. Pero claro, la respuesta es depende..",
 fecha:"14/02/1980"
},

{
 imagen:'https://static.wixstatic.com/media/e2735e_6f8d2fadb3f84e95afc258ba28ea27e2~mv2.jpg/v1/fill/w_300,h_183,q_90/e2735e_6f8d2fadb3f84e95afc258ba28ea27e2~mv2.jpg',
 categoria:"Estilo Furgonetas",
 nombre:"camper",
descripcion:"Opel Vivaro.Nissan NV200.Volkswagen California.Fiat Fullback.Citroën SpaceTourer.Nissan NV300.En esencia, una camper es un vehículo autopropulsado que sirve tanto como para dormir como para viajar. La diferencia fundamental con las autocaravanas de toda la vida reside en que han sido acondicionadas a partir del vehículo original,.",
fecha:"08/12/2001"
},

{
 imagen:'https://yevana.com/wp-content/uploads/2021/03/Black.Label_.jpg',
 categoria:"Estilo Furgonetas",
 nombre:"camper",
descripcion:"El proceso de camperización consiste en modificar el interior del vehículo para adaptarlo a una furgoneta vivienda. ... Aunque es posible evitar el proceso de homologación siempre y cuando el mobiliario del interior no se encuentre atornillado al chasis del vehículo, es decir que sea desmontable. ",
fecha:"31/06/1995"
},

{
 imagen:'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/sunlight-cliff-4x4-adventure-camper-3-1566728331.jpg',
 categoria:"Estilo Furgonetas",
 nombre:"Camper",
descripcion:"Una furgoneta camperizada es una excelente opción para viajar con libertad. Camperizar una furgoneta cuesta desde 2.300 euros hasta en torno a 6.000 euros, según los materiales que se utilicen y la cantidad de equipamiento del que queramos disponer en nuestra 'casa portátil'.",
fecha:"21/08/2021"
}





]


constructor(private gestorRutas:ActivatedRoute) {}


    ngOnInit(): void {

      this.gestorRutas.params.subscribe((elementos:Params)=> {
        this.secciones = elementos['categoria'];
        this.filtradas = this.estilos.filter((e)=>{
          return e.categoria.toLowerCase().includes(this.secciones.toLowerCase());
        });
      });
    }

}

