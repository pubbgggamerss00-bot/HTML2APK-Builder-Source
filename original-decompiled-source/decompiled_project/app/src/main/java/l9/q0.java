package l9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements eh.l {
    @Override // eh.l
    public final Object invoke(Object obj) {
        Byte b10 = (Byte) obj;
        b10.byteValue();
        return String.format("%02X", Arrays.copyOf(new Object[]{b10}, 1));
    }
}
