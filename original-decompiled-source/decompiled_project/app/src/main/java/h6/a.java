package h6;

import android.content.res.Configuration;
import android.database.SQLException;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.r;
import x0.j;

/* loaded from: classes.dex */
public final class a {
    public static final void a(String sql, b bVar) {
        r.e(bVar, "<this>");
        r.e(sql, "sql");
        d dVarB0 = bVar.B0(sql);
        try {
            dVarB0.t0();
            ch.a.a(dVarB0, null);
        } finally {
        }
    }

    public static final boolean b(j jVar) {
        return (((Configuration) jVar.f(AndroidCompositionLocals_androidKt.f1280a)).uiMode & 48) == 32;
    }

    public static final void c(int i10, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i10);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }
}
