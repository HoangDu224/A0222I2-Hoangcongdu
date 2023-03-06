import {Component, OnInit} from '@angular/core';
import {IWord} from '../model/IWord';
import {Router} from '@angular/router';
import {DictionaryServiceService} from '../service/dictionary-service.service';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  dictionarys: IWord[];

  constructor(private dictionaryServiceService: DictionaryServiceService, private router: Router) {
      this.dictionarys = dictionaryServiceService.getAll();
  }

  ngOnInit(): void {
  }

  info(word: string) {
    this.router.navigate(['/detail', word]);
  }
}
