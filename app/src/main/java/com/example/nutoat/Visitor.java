package com.example.nutoat;

public class Visitor {

        int id;
        String Name;

        String time_stamp;
        public Visitor(String name, String time_stamp) {
            this.Name = name;

            this.time_stamp = Utility.get_ts();
        }
        public String getName() {
            return Name;
        }
        public void setName(String Stuid) {
            this.Name = Stuid;
        }

        public String getTime_stamp() {
            return time_stamp;
        }
        public void setTime_stamp() {
            this.time_stamp = Utility.get_ts();
        }

    }

