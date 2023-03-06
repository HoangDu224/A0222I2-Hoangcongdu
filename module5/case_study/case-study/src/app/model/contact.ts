import {Customer} from "./customer";
import {Facility} from "./facility";

export interface Contact {
  id: number,
  customer: Customer,
  service: Facility,
  startDate: string,
  endDate: string,
  money: string
}
