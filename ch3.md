### 谈谈final、finally、 finalize有什么不同？

        try {
            //do something
            System.exit(1);
        } finally {
            System.out.println("print from finally");
        }
        
finally块不会执行        

* TODO JAVA9 中的cleaner



