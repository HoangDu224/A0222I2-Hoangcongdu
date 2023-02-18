import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  result: string ;

  constructor() {
  }

  ngOnInit(): void {
  }

  doCalculator(number1: string, number2: string, operator: string) {
    const firstOperator = parseInt(number1, 10);
    const secondOperator = parseInt(number2, 10);
    if (operator === '/' && (firstOperator === 0 || secondOperator === 0)) {
      this.result = 'Khong the chia cho 0';
    }
    switch (operator) {
      case '+': {
        this.result = String(firstOperator + secondOperator);
        break;
      }
      case '-': {
        this.result = String(firstOperator - secondOperator);
        break;
      }
      case '*': {
        this.result = String(firstOperator * secondOperator);
        break;
      }
      case '/': {
        this.result = String(firstOperator / secondOperator);
        break;
      }
    }
  }

}
