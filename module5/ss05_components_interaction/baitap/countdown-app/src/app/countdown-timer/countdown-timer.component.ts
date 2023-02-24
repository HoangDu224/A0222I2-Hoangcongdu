import {Component, OnInit} from '@angular/core';
import {interval} from 'rxjs';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit {
  intervals;
  countNum = 10;

  constructor() {
  }

  ngOnInit(): void {
  }

  doCount(status: boolean) {
    if (status === true) {
      if (this.countNum === 0) {
        this.countNum = 10;
      }
      this.intervals = setInterval(() => {
        this.countNum--;
        if (this.countNum === 0) {
          clearInterval(this.intervals);
          return;
        }
      }, 1000);
    } else {
      clearInterval(this.intervals);
      return;
    }
  }

  resetCount() {
    clearInterval(this.intervals);
    this.countNum = 10;
  }
}
