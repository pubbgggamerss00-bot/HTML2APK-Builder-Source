package lf;

/* loaded from: classes2.dex */
public final class k {
    public static boolean a(char c10) {
        if (c10 == 160 || c10 == 5760) {
            return true;
        }
        return (8192 <= c10 && c10 <= 8203) || c10 == 8239 || c10 == 8287 || c10 == 12288;
    }
}
