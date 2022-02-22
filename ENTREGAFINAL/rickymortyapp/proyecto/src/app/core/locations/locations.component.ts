import { Component, OnInit } from '@angular/core';
import { LocationsService } from 'src/app/shared/services/locations.service';

@Component({
  selector: 'proyecto-locations',
  templateUrl: './locations.component.html',
  styleUrls: ['./locations.component.css']
})
export class LocationsComponent implements OnInit {

  locationsList: any []= [];

  constructor( private locationsService: LocationsService) { }

  ngOnInit(): void {
    this.locationsService.getAllLocations().subscribe((e)=>{this.locationsList= e.results})
  }

}
