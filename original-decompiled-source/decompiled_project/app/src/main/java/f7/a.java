package f7;

import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkTagDao;
import c7.i0;
import c7.j;
import e.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import qg.x;
import t6.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8869a;

    static {
        String strF = s.f("DiagnosticsWrkr");
        r.d(strF, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f8869a = strF;
    }

    public static final String a(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            j jVarA = i0.a(workSpec);
            String str = workSpec.f3167a;
            SystemIdInfo systemIdInfoE = systemIdInfoDao.e(jVarA);
            Integer numValueOf = systemIdInfoE != null ? Integer.valueOf(systemIdInfoE.f3166c) : null;
            String strI = x.I(workNameDao.b(str), ",", null, null, null, 62);
            String strI2 = x.I(workTagDao.b(str), ",", null, null, null, 62);
            StringBuilder sbA = e.a("\n", str, "\t ");
            sbA.append(workSpec.f3169c);
            sbA.append("\t ");
            sbA.append(numValueOf);
            sbA.append("\t ");
            sbA.append(workSpec.f3168b.name());
            sbA.append("\t ");
            sbA.append(strI);
            sbA.append("\t ");
            sbA.append(strI2);
            sbA.append('\t');
            sb.append(sbA.toString());
        }
        String string = sb.toString();
        r.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
