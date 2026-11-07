package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class i0 {
    public static String a(n nVar) {
        String string = nVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
