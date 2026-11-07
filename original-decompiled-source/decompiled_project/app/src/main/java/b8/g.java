package b8;

import hi.b0;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g {
    public static void a(hi.n nVar, b0 b0Var) throws IOException {
        if (nVar.M(b0Var)) {
            return;
        }
        try {
            nVar.f0(b0Var, false).close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void b(hi.n nVar, b0 b0Var) throws IOException {
        try {
            IOException iOException = null;
            for (b0 b0Var2 : nVar.N(b0Var)) {
                try {
                    if (nVar.Z(b0Var2).f13087b) {
                        b(nVar, b0Var2);
                    }
                    nVar.z(b0Var2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
