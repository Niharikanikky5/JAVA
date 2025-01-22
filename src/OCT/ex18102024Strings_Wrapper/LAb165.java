package OCT.ex18102024Strings_Wrapper;

public class LAb165 {

    class Super {

        private int a;

        protected Super(int a) {
            this.a = a;
        }
        Super(){

        }

    }

    class Sub extends Super {

        public Sub(int a) {
            super(a);
        }

        public Sub() {
            super();
        }

    }

}
