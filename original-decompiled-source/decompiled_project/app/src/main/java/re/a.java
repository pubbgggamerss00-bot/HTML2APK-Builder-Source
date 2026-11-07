package re;

import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: f, reason: collision with root package name */
    public String f23447f;

    /* renamed from: g, reason: collision with root package name */
    public String f23448g;

    /* renamed from: h, reason: collision with root package name */
    public int f23449h;

    /* renamed from: j, reason: collision with root package name */
    public LinkedList f23450j;

    /* renamed from: k, reason: collision with root package name */
    public c5.p f23451k;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f23452l;

    /* renamed from: m, reason: collision with root package name */
    public final C0258a f23453m;

    /* renamed from: re.a$a, reason: collision with other inner class name */
    public class C0258a implements we.c {
        public C0258a() {
        }

        @Override // we.c
        public final r a(String str) throws IOException {
            return a.this.b(0);
        }
    }

    public a() {
        new LinkedList();
        this.f23450j = new LinkedList();
        this.f23452l = new ConcurrentHashMap();
        this.f23453m = new C0258a();
    }

    @Override // re.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final n b(int i10) throws IOException {
        Integer numValueOf = Integer.valueOf(i10);
        ConcurrentHashMap concurrentHashMap = this.f23452l;
        n nVar = (n) concurrentHashMap.get(numValueOf);
        if (nVar != null) {
            return nVar;
        }
        int iD = this.f23462c.d(i10);
        byte[][] bArr = this.f23463d;
        byte[] bArr2 = bArr[iD];
        int iIntValue = 0;
        if (bArr2 == null) {
            bArr2 = bArr[0];
        }
        v vVar = new v();
        vVar.f23530a = 0;
        vVar.f23531b = 0;
        vVar.f23532c = null;
        Locale locale = Locale.US;
        String.format(locale, "%04x", Integer.valueOf(i10));
        byte[][] bArr3 = this.f23464e;
        int iV = this.f23451k.V(iD);
        List<Object> listA = vVar.a(bArr2, bArr3, iV != -1 ? (byte[][]) ((Map) this.f23450j.get(iV)).get("Subrs") : null, true);
        String str = this.f23460a;
        int iV2 = this.f23451k.V(iD);
        int iIntValue2 = DescriptorProtos.Edition.EDITION_2023_VALUE;
        if (iV2 != -1) {
            Map map = (Map) this.f23450j.get(iV2);
            if (map.containsKey("defaultWidthX")) {
                iIntValue2 = ((Number) map.get("defaultWidthX")).intValue();
            }
        }
        int i11 = iIntValue2;
        int iV3 = this.f23451k.V(iD);
        if (iV3 != -1) {
            Map map2 = (Map) this.f23450j.get(iV3);
            if (map2.containsKey("nominalWidthX")) {
                iIntValue = ((Number) map2.get("nominalWidthX")).intValue();
            }
        }
        n nVar2 = new n(this.f23453m, str, String.format(locale, "%04x", Integer.valueOf(i10)), listA, i11, iIntValue);
        concurrentHashMap.put(Integer.valueOf(i10), nVar2);
        return nVar2;
    }
}
