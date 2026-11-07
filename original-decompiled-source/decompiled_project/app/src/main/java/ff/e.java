package ff;

import cf.l;
import cf.o;
import cf.t;
import j2.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class e extends a {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f11213e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11214f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11215g;

    public e(t tVar, cf.e eVar) throws IOException {
        super(new d(tVar.U0()));
        this.f11213e = null;
        this.f11184c = eVar;
        int iG0 = tVar.G0(l.f5527v1, null, -1);
        this.f11214f = iG0;
        if (iG0 == -1) {
            throw new IOException("/N entry missing in object stream");
        }
        if (iG0 < 0) {
            throw new IOException(y.a(iG0, "Illegal /N entry in object stream: "));
        }
        int iG02 = tVar.G0(l.C0, null, -1);
        this.f11215g = iG02;
        if (iG02 == -1) {
            throw new IOException("/First entry missing in object stream");
        }
        if (iG02 < 0) {
            throw new IOException(y.a(iG02, "Illegal /First entry in object stream: "));
        }
    }

    public final void v() throws IOException {
        j jVar = this.f11183b;
        try {
            TreeMap treeMap = new TreeMap();
            long position = jVar.getPosition();
            int i10 = this.f11215g;
            long j10 = (position + i10) - 1;
            for (int i11 = 0; i11 < this.f11214f && jVar.getPosition() < j10; i11++) {
                treeMap.put(Integer.valueOf((int) p()), Long.valueOf(q()));
            }
            this.f11213e = new ArrayList(treeMap.size());
            for (Map.Entry entry : treeMap.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                long position2 = jVar.getPosition();
                int i12 = iIntValue + i10;
                if (i12 > 0 && position2 < i12) {
                    jVar.c0(i12 - ((int) position2));
                }
                o oVar = new o(k());
                oVar.f5551d = 0;
                oVar.f5550c = ((Long) entry.getValue()).longValue();
                this.f11213e.add(oVar);
            }
        } finally {
            jVar.close();
        }
    }
}
