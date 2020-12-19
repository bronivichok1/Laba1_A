package com.company;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


    public class Main {
        public static void main(String[] args) throws Exception {
            int  TeaType = 0, MilkType = 0;
            // Создаем экземпляры класса, чтобы найти кол-во продуктов по типам
            Milk CompM = new Milk(null);
            Tea CompT = new Tea(null);

            Food[] breakfast = new Food[20];

            int S = 0;



            


            for (String arg: args) {
                String[] parts = arg.split("/");

                if (parts[0].equals("Milk")) {
                    breakfast[S] = new Milk(parts[1]);
                } else
                if (parts[0].equals("Tea")) {
                    breakfast[S] = new Tea(parts[1]);
                }
               S++;
            }

            System.out.println("Давайте посчитаем количество продуктов разного типа.");
            for (int i =0; i<20;i++) {
                if (breakfast[i] != null)   {

                    if (breakfast[i].equals(CompM)) {
                        MilkType++;
                    } else
                    if (breakfast[i].equals(CompT)) {
                        TeaType++;
                    }
                } else
                    break;
            }
            System.out.println("Ваш завтрак состоит из "+TeaType+" кружок чая и "+MilkType+" молока ");

            for (Food item: breakfast) {
                if (item != null) {
                    item.consume();
                } else
                    break;
            }
            System.out.println("Всего хорошего!");
        }
    }
