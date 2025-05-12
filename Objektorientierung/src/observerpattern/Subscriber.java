package observerpattern;



    public class Subscriber {
        private String name;
        private Channel channel = new Channel();

        public Subscriber(String name) {
            this.name = name;
        }

        public void update() {
            System.out.println("Video uploaded");
        }
        public void subscribe(Channel channel){
            this.channel = channel;
            channel.subscriber(this);
        }
        public void unsubscribe(Channel channel){
            this.channel.unsubscriber(this);
        }

    }
