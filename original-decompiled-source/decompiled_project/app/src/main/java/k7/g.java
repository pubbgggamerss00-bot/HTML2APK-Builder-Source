package k7;

import android.os.StatFs;
import hi.b0;
import hi.n;
import java.io.File;
import jh.j;
import k7.a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements eh.a {
    @Override // eh.a
    public final Object invoke() {
        long jN;
        a.C0162a c0162a = new a.C0162a();
        b0 b0VarE = n.f13099b.e("coil3_disk_cache");
        double d10 = c0162a.f16007b;
        if (d10 > 0.0d) {
            try {
                File file = b0VarE.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                jN = j.n((long) (d10 * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), c0162a.f16008c, c0162a.f16009d);
            } catch (Exception unused) {
                jN = c0162a.f16008c;
            }
        } else {
            jN = 0;
        }
        return new f(jN, c0162a.f16006a, b0VarE, c0162a.f16010e);
    }
}
