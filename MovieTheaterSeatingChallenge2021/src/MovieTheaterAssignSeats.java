import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MovieTheaterAssignSeats {

    static int theaterAvailability;
    static int row, col, curRow, curCol;

    //Theater dimensions
    static {
        theaterAvailability = 200;
        row = 10;
        col = 20;
        curRow = 0;
        curCol = 0;
    }

    public static void main(String[] args){
        String filePath;
        filePath = args[0];
        try {
            PrintWriter writer = new PrintWriter("Output.txt");

            FileInputStream fileStream = new FileInputStream(filePath);
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader br = new BufferedReader(new InputStreamReader(dataStream));
            String strLine;

            // Reading the file line by line
            while ((strLine = br.readLine()) != null) {
                String[] str = strLine.split(" ");

                if (getSeats(str[0], Integer.parseInt(str[1]), writer)) {
                    continue;
                } else {
                    break;
                }

            }
            writer.close();
            dataStream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static boolean getSeats(String resId, int seats, PrintWriter output){
        if (theaterAvailability <= 0)
            return false;

        if (seats > 0) {
            output.write(resId + " ");
            //To public safety, assume that a buffer of three seats
            if(curCol > 0 && (curCol + 3) <= col){
                curCol += 3;
                theaterAvailability -= 3;
            }
            while (seats > 0 && theaterAvailability > 0) {
                //To assign neighboring seats
                if (curCol + 1 <= col) {
                    curCol++;
                    //we need to assign seats form the best rows to the worst rows
                    output.write((Character.toString((char) ('E' + curRow))) + curCol);
                    --theaterAvailability;
                    --seats;
                    if (seats == 0) {
                        output.println("");
                        return true;

                    } else
                        output.write(",");
                }
                else{
                    if(curRow + 1 <= row / 2){
                        //To move to next row
                        curCol = 1;
                        curRow++;
                        output.write((Character.toString((char) ('E' + curRow))) + curCol);
                        --theaterAvailability;
                        --seats;
                        if (seats == 0)
                            return true;
                        else
                            output.write(",");
                    }
                    else if(curRow + 1 > row / 2){
                        curCol = 1;
                        curRow = 3;
                        while(curRow >= 0){
                            output.write((Character.toString((char) ('A' + curRow))) + curCol);
                            --theaterAvailability;
                            --seats;
                            if (seats == 0)
                                return true;
                            else
                                output.write(",");
                            curRow--;
                        }
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
        }
    }