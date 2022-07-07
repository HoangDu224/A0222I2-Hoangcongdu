package ss17BinaryFileAndSerialization.BaiTap.QuanLiSanPhamRaFileNhiPhan;

import java.util.*;

public class ProductManager{
    List<Productt> producttList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    public void add(Productt productt){
        producttList.add(productt);
    }
    public void addProductt(String name ,int price , String production , int ID) {
        producttList.add(new Productt(name, price, production, ID));
    }
        public void display(){
            for (int i =0 ; i<producttList.size();i++){
                System.out.println(producttList.get(i));
            }
        }
        public List<Productt> getListProductt(){
            return producttList;
        }
        public void editById(int Id){
            boolean flag = false;
            for (int i =0 ; i<producttList.size();i++){
                if(producttList.get(i).getID() == Id ){
                    System.out.println("Name Edit :");
                    String name = scan.nextLine();
                    System.out.println("Price Edit :");
                    int price = scan.nextInt();
                    producttList.get(i).setPrice(price);
                    producttList.get(i).setName(name);
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println("Id not found");
            }
        }
        public void deleteById(int Id){
            boolean flag = false;
            for (int i =0 ; i<producttList.size();i++){
                if(producttList.get(i).getID() == Id ){
                    producttList.remove(i);
                    flag = true;
                }
            }
            if (!flag){
                System.out.println("Id not found");
            }
        }
        public Object searchByName(String name){
            for (int i =0 ; i<producttList.size();i++){
                if(producttList.get(i).getName().equals(name)){
                    return producttList.get(i);
                }
            }
            return null;
        }
        public void sortTangDan(){
            Collections.sort(producttList, new Comparator<Productt>() {
                @Override
                public int compare(Productt o1, Productt o2) {
                    return  o1.getPrice() - o2.getPrice();
                }

            });
        }
        public void sortGiamDan(){
            Collections.sort(producttList, new Comparator<Productt>() {
                @Override
                public int compare(Productt o1, Productt o2) {
                    return  o1.getPrice() < o2.getPrice()? 1 : -1;
                }
            });
        }
}
