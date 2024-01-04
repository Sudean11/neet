package injava;

import java.util.*;
import java.util.stream.Collectors;

public class CarFleet {
    class Car{
        int position;
        int speed;
        Car(int position, int speed){
            this.position = position;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return this.position+" "+this.speed;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {

        List<Car> cars = new ArrayList<>();
        for(int i = 0 ;i< position.length; i++){
            cars.add(new Car(position[i], speed[i]));
        }
        cars = cars.stream().sorted(Comparator.comparing(x->x.position)).collect(Collectors.toList());
        Collections.reverse(cars);

        Stack<Car> stack = new Stack<>();
        int fleets = 0;
        for(int i = 0; i<cars.size(); i++){
            if(!stack.isEmpty()){
                double x = (double)(target- stack.peek().position)/stack.peek().speed;
                double y = (double)(target- cars.get(i).position)/cars.get(i).speed;
                System.out.println("early: "+x
                        +" behind: "+y);
                if(x<y) {
                    System.out.println("Thats why here");
                    fleets++;
                    stack.empty();
                    stack.push(cars.get(i));
                    continue;
                }
            }
            if(!stack.isEmpty()){
                double x = (double)(target- stack.peek().position)/stack.peek().speed;
                double y = (double)(target- cars.get(i).position)/cars.get(i).speed;
                if(x > y){
                    continue;
                }
            }
            stack.push(cars.get(i));

        }

        System.out.println(cars.toString());
        if(!stack.isEmpty()){
            fleets++;
        }
        return fleets;
    }

    public static void main(String[] args) {
        System.out.println(new CarFleet().carFleet(10, new int[]{0,4,2}, new int[]{2,1,3}));
    }
}
