package t6;

import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class v extends e0 {
    public static final v a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.r.d(uuidRandomUUID, "randomUUID()");
        String string = uuidRandomUUID.toString();
        kotlin.jvm.internal.r.d(string, "id.toString()");
        String name = DiagnosticsWorker.class.getName();
        WorkSpec workSpec = new WorkSpec(string, (c0) null, name, (String) null, (androidx.work.b) null, (androidx.work.b) null, 0L, 0L, 0L, (e) null, 0, (a) null, 0L, 0L, 0L, 0L, false, (b0) null, 0, 0L, 0, 0, (String) null, 16777210);
        String[] strArr = {DiagnosticsWorker.class.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(qg.j0.a(1));
        linkedHashSet.add(strArr[0]);
        v vVar = new v(uuidRandomUUID, workSpec, linkedHashSet);
        e eVar = workSpec.f3176j;
        boolean z10 = eVar.b() || eVar.f28006e || eVar.f28004c || eVar.f28005d;
        if (workSpec.f3183q) {
            if (z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (workSpec.f3173g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (workSpec.f3190x == null) {
            List listO = mh.x.O(name, new String[]{"."});
            String strB0 = listO.size() == 1 ? (String) listO.get(0) : (String) qg.x.J(listO);
            if (strB0.length() > 127) {
                strB0 = mh.y.b0(CertificateBody.profileType, strB0);
            }
            workSpec.f3190x = strB0;
        }
        UUID uuidRandomUUID2 = UUID.randomUUID();
        kotlin.jvm.internal.r.d(uuidRandomUUID2, "randomUUID()");
        String string2 = uuidRandomUUID2.toString();
        kotlin.jvm.internal.r.d(string2, "id.toString()");
        new WorkSpec(string2, workSpec.f3168b, name, workSpec.f3170d, new androidx.work.b(workSpec.f3171e), new androidx.work.b(workSpec.f3172f), workSpec.f3173g, workSpec.f3174h, workSpec.f3175i, new e(workSpec.f3176j), workSpec.f3177k, workSpec.f3178l, workSpec.f3179m, workSpec.f3180n, workSpec.f3181o, workSpec.f3182p, workSpec.f3183q, workSpec.f3184r, workSpec.f3185s, workSpec.f3187u, workSpec.f3188v, workSpec.f3189w, workSpec.f3190x, PKIFailureInfo.signerNotTrusted);
        return vVar;
    }
}
