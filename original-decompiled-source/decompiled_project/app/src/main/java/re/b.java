package re;

import java.io.IOException;
import p.i0;

/* loaded from: classes2.dex */
public final class b extends p {
    public final int h() throws IOException {
        int iF = f();
        if (iF >= 1 && iF <= 4) {
            return iF;
        }
        StringBuilder sbB = i0.b(iF, "Illegal (< 1 or > 4) offSize value ", " in CFF font at position ");
        sbB.append(this.f23511b - 1);
        throw new IOException(sbB.toString());
    }
}
