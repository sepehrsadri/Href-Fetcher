package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class about{
        public void read() throws IOException {
            FileInputStream fis = new FileInputStream("aboutApp.txt");
            byte[] buffer = new byte[10];
            StringBuilder sb = new StringBuilder();
            while (fis.read(buffer) != -1) {
                sb.append(new String(buffer));
                buffer = new byte[10];
            }
            fis.close();

            String content = sb.toString();
            System.out.println(content);


        }


    }
