package structures.goods;

public enum KindsOfOptions {
    
    CORP {
        @Override
        public String toString() {
          return "Корпоративный тариф";
        }
    },
    ONLY_CALLS {
        @Override
        public String toString() {
          return "Только звонки";
        }
    },
    FULL_FUNCTION {
        @Override
        public String toString() {
          return "Тариф со всеми функциями";
        }
    };
    
    public static KindsOfOptions getValueOf(String s) {
        if (CORP.toString().startsWith(s)) {
            return CORP;
        } else if (ONLY_CALLS.toString().startsWith(s)) {
            return ONLY_CALLS;
        }
        else return FULL_FUNCTION;
    }
}
