package hospital_management_system;

public class Status {

        private String currentStatus;

        private boolean urgency;

        public Status(){

        }

        public Status (String currentStatus, boolean urgency) {

            this.currentStatus = currentStatus;
            this.urgency = urgency;

        }

        public String getCurrentStatus() {
            return currentStatus;
        }

        public void setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
        }

        public boolean getUrgency() {
            return urgency;
        }

        public void setUrgency(boolean urgency) {
            this.urgency = urgency;
        }

        @Override
        public String toString() {
            return "Status{" +
                    "currentStatus='" + currentStatus + '\'' +
                    ", urgency=" + urgency +
                    '}';
        }
    }

