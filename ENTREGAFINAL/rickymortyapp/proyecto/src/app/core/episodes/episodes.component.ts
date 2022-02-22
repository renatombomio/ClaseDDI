import { EpisodesService } from './../../shared/services/episodes.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'proyecto-episodes',
  templateUrl: './episodes.component.html',
  styleUrls: ['./episodes.component.css']
})

export class EpisodesComponent implements OnInit {

  episodesList: any []= [];

  constructor(private episodesService: EpisodesService) { }

  ngOnInit(): void {

    this.episodesService.getAllEpisodes().subscribe((i)=>{this.episodesList= i.results})

  }

}
