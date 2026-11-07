package org.jf.dexlib2;

import nc.e;
import nc.o;
import nc.t0;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class MethodHandleType {
    public static final int INSTANCE_GET = 3;
    public static final int INSTANCE_PUT = 2;
    public static final int INVOKE_CONSTRUCTOR = 6;
    public static final int INVOKE_DIRECT = 7;
    public static final int INVOKE_INSTANCE = 5;
    public static final int INVOKE_INTERFACE = 8;
    public static final int INVOKE_STATIC = 4;
    public static final int STATIC_GET = 1;
    public static final int STATIC_PUT = 0;
    private static final e<Integer, String> methodHandleTypeNames;

    static {
        o.a aVar = new o.a(4);
        aVar.d(0, "static-put");
        aVar.d(1, "static-get");
        aVar.d(2, "instance-put");
        aVar.d(3, "instance-get");
        aVar.d(4, "invoke-static");
        aVar.d(5, "invoke-instance");
        aVar.d(6, "invoke-constructor");
        aVar.d(7, "invoke-direct");
        aVar.d(8, "invoke-interface");
        methodHandleTypeNames = aVar.c();
    }

    public static int getMethodHandleType(String str) {
        Integer num = (Integer) ((t0) methodHandleTypeNames).f18751h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new ExceptionWithContext("Invalid method handle type: %s", str);
    }

    public static String toString(int i10) {
        String str = methodHandleTypeNames.get(Integer.valueOf(i10));
        if (str != null) {
            return str;
        }
        throw new InvalidMethodHandleTypeException(i10);
    }

    public static class InvalidMethodHandleTypeException extends ExceptionWithContext {
        private final int methodHandleType;

        public InvalidMethodHandleTypeException(int i10) {
            super("Invalid method handle type: %d", Integer.valueOf(i10));
            this.methodHandleType = i10;
        }

        public int getMethodHandleType() {
            return this.methodHandleType;
        }

        public InvalidMethodHandleTypeException(int i10, String str, Object... objArr) {
            super(str, objArr);
            this.methodHandleType = i10;
        }
    }
}
