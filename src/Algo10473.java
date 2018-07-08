//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Algo10473 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] line = br.readLine().split(" ");
//        double cur_x = Double.parseDouble(line[0]);
//        double cur_y = Double.parseDouble(line[1]);
//
//        line = br.readLine().split(" ");
//        double x = Double.parseDouble(line[0]);
//        double y = Double.parseDouble(line[1]);
//
//        int n = Integer.parseInt(br.readLine());
//        double[][] cannon = new double[n][2];
//
//        for (int i = 0; i < n; ++i) {
//            line = br.readLine().split(" ");
//            cannon[i][0] = Double.parseDouble(line[0]);
//            cannon[i][1] = Double.parseDouble(line[1]);
//        }
//        br.close();
//        double[][] times = new double[n][n+1];
//        for (int i = 0; i < n; ++i) {
//            double dis = Math.sqrt(Math.pow(x-cannon[i][0], 2) + Math.pow(y-cannon[i][1], 2));
//            times[i][n] = dis > 50 ? (dis-50)/5+2: dis/5;
//        }
//        for (int i = 0; i < n; ++i) {
//            for (int j = i+1; j < n; ++j) {
//                double dis = Math.sqrt(Math.pow(cannon[j][0]-cannon[i][0], 2) + Math.pow(cannon[j][1]-cannon[i][1], 2));
//                double time = dis > 50 ? (dis-50)/5+2: dis/5;
//                times[i][j] = time;
//                times[j][i] = time;
//            }
//        }
//
//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < n; ++j) {
//                for (int k = 0; k <= n; ++k) {
//                    times[j][k] = times[j][k] > times[j][i] + times[i][k] ? times[j][i] + times[i][k] : times[j][k];
//                }
//            }
//        }
//        int index = 0;
//        double min = Math.sqrt(Math.pow(cur_x-cannon[0][0], 2) + Math.pow(cur_y-cannon[0][1], 2));
//        min = min > 50 ? (min-50)/5+2:min/5;
//        for (int i = 1; i < n; ++i) {
//            double dis = Math.sqrt(Math.pow(cur_x-cannon[i][0], 2) + Math.pow(cur_y-cannon[i][1], 2));
//            dis = dis > 50 ? (dis-50)/5+2: dis/5;
//            if (min > dis) {
//                min = dis;
//                index = i;
//            }
//        }
//        System.out.println(min + times[index][n]);
//
//    }
//}
