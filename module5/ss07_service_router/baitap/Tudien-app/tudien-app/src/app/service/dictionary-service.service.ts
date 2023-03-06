import {Injectable} from '@angular/core';
import {IWord} from '../model/IWord';
import {element} from 'protractor';

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {
  private dictionarys: IWord[] = [];

  constructor() {
    this.dictionarys.push(
      {
        word: 'hello', mean: 'xin chao'
      },
      {
        word: 'goodbye', mean: 'tam biet'
      },
      {
        word: 'test', mean: 'test test'
      },
    );
  }
  getAll() {
    return this.dictionarys;
  }

  doTranslate(word: string): IWord {
    console.log(this.dictionarys.filter(index => index.word === word)[0]);
    return this.dictionarys.filter(index => index.word === word)[0];
  }
}
