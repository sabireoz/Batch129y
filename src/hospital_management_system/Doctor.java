package hospital_management_system;



    public class Doctor {

        private String doctorName;
        private String doctorSurname;
        private String title;


        public Doctor() {

        }


        public Doctor(String name, String surName, String title) {
            this.doctorName = name;
            this.doctorSurname = surName;
            this.title = title;
        }


        public String getDoctorName() {

            return doctorName;
        }

        public void setDoctorName(String doctorName) {
            this.doctorName = doctorName;
        }

        public String getSurName() {
            return doctorSurname;
        }

        public void setSurName(String surName) {
            this.doctorSurname = surName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        @Override
        public String toString() {
            return "Doctor{" +
                    "name='" + doctorName + '\'' +
                    ", surName='" + doctorSurname + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }


    }


