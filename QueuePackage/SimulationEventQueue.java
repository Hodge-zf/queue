

public abstract class SimulationEventQueue implements SimulationEventQueueInterface
    {

      /*public SimulationEventQueue simulationEventQueue(){
        SimulationEventQueue simulationEventQueue;
        return simulationEventQueue;
      }*/

      private double time;

      private int size;

      public void add(SimulationEvent newEntry){
      }

      public SimulationEvent remove(){
        SimulationEvent simulationEvent = null;
        return simulationEvent;
      }

      public SimulationEvent peek(){
        SimulationEvent simulationEvent = null;
        return simulationEvent;
      }

      public boolean isEmpty(){
        boolean isEmpty = false;
        return isEmpty;
      }

      public int getSize(){
        int size = 0;
        return size;
      }

      public void clear(){

      }

      public double getCurrentTime(){
        double time = 0;
        return time;
      }


}
