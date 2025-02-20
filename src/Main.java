public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new QueueImpl<Integer>(5);
        try {
            q.push(1);
            System.out.println(q.size());
            q.push(2);
            System.out.println(q.size());
            q.push(3);
            System.out.println(q.size());
            q.push(4);
            System.out.println(q.size());
            q.push(5);
            System.out.println(q.size());
            q.push(6);

        } catch (FullQueueException fullExp) {
            //
            System.out.println("EXCEPCIÓ!!");
            fullExp.printStackTrace();
        }

        System.out.println("Inicialitzem la cua, afegim 3 elements i els desencolem!!!");

        try {
            q = new QueueImpl<Integer>(5);
            q.push(1);
            System.out.println(q.size());
            q.push(2);
            System.out.println(q.size());
            q.push(3);
            System.out.println(q.size());

            int v;
            while (q.size() > 0) {
                v = q.pop();
                System.out.println(v);
            }

            q.pop();
        }
        catch (FullQueueException fullExc) {
            System.out.println("EXCEPCIÓ FULL!!!");
            fullExc.printStackTrace();
        }
        catch (EmptyQueueException emptyExc) {
            System.out.println("EXCEPCIÓ EMPTY!!!!!");
            emptyExc.printStackTrace();
        }


        System.out.println("Ara fem una cua de cadena de caracters");
        try {
            Queue<String> q2 = new QueueImpl<String>(5);
            q2.push("HOLA");
            System.out.println(q.size());
            q2.push("DSA");
            System.out.println(q.size());
            q2.push("MOLA!!!");
            System.out.println(q.size());

            String s;
            while (q2.size() > 0) {
                s = q2.pop();
                System.out.println(s);
            }
        }
        catch (FullQueueException fullExc) {
            System.out.println("EXCEPCIÓ FULL!!!");
            fullExc.printStackTrace();
        }
        catch (EmptyQueueException emptyExc) {
            System.out.println("EXCEPCIÓ EMPTY!!!!!");
            emptyExc.printStackTrace();
        }

    }
}
