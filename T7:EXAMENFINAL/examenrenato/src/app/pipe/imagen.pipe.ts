import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'imagen'
})
export class ImagenPipe implements PipeTransform {

  transform(value: string, ...args: unknown[]): unknown {

      return "/Users/renato/Desktop/DAM 2/ClaseDDI/T7:EXAMENFINAL/examenrenato/src/assets/Logotipo-CES-Madrid-3.jpeg"
  }

}