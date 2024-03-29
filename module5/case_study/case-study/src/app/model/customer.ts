import {TypeCustomer} from "./TypeCustomer";

export interface Customer {
  id: number,
  name: string,
  birthday: string,
  gender: boolean,
  idCard: string,
  phone: number,
  email: string,
  address: string,
  type?: TypeCustomer
}
