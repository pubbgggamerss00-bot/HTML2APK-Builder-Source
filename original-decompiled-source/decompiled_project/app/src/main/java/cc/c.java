package cc;

/* loaded from: classes2.dex */
public abstract class c {
    public static u c() {
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 == 3) {
            return new u();
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((b10 & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public abstract boolean a();

    public abstract int b();
}
