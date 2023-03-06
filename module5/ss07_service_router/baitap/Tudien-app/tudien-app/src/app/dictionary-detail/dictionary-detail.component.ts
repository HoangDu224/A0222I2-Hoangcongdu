import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {DictionaryServiceService} from '../service/dictionary-service.service';
import {IWord} from '../model/IWord';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  word: IWord;

  constructor(private activatedRoute: ActivatedRoute,
              private dictionaryServiceService: DictionaryServiceService) {
    this.activatedRoute.paramMap.subscribe(next => {
        const id = next.get('id');
        if (id != null) {
          this.word = this.dictionaryServiceService.doTranslate(id);
          console.log(this.word);
        }
      }, error => {

      }, () => {

      }
    );
  }

  ngOnInit(): void {
  }

}
