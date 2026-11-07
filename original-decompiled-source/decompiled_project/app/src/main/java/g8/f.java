package g8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements eh.l {
    @Override // eh.l
    public final Object invoke(Object obj) {
        Byte b10 = (Byte) obj;
        b10.byteValue();
        return String.format("%02x", Arrays.copyOf(new Object[]{b10}, 1));
    }
}
