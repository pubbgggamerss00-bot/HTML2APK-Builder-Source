package re;

import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p5.d1;

/* loaded from: classes2.dex */
public final class m extends g {

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f23502f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f23503g = new ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final a f23504h = new a();

    public class a implements we.c {
        public a() {
        }

        @Override // we.c
        public final r a(String str) throws IOException {
            m mVar = m.this;
            d1 d1Var = mVar.f23462c;
            if (d1Var.f21200a) {
                throw new IllegalStateException("Not a Type 1-equivalent font");
            }
            Integer num = (Integer) ((HashMap) d1Var.f21203d).get(str);
            int iIntValue = num == null ? 0 : num.intValue();
            d1 d1Var2 = mVar.f23462c;
            if (d1Var2.f21200a) {
                throw new IllegalStateException("Not a Type 1-equivalent font");
            }
            Integer num2 = (Integer) ((HashMap) d1Var2.f21201b).get(Integer.valueOf(iIntValue));
            return mVar.c(num2 != null ? num2.intValue() : 0, str);
        }
    }

    @Override // re.g
    public final u b(int i10) throws IOException {
        return c(i10, "GID+" + i10);
    }

    public final u c(int i10, String str) throws IOException {
        Integer numValueOf = Integer.valueOf(i10);
        ConcurrentHashMap concurrentHashMap = this.f23503g;
        u uVar = (u) concurrentHashMap.get(numValueOf);
        if (uVar != null) {
            return uVar;
        }
        byte[][] bArr = this.f23463d;
        byte[] bArr2 = i10 < bArr.length ? bArr[i10] : null;
        if (bArr2 == null) {
            bArr2 = bArr[0];
        }
        v vVar = new v();
        vVar.f23530a = 0;
        vVar.f23531b = 0;
        vVar.f23532c = null;
        byte[][] bArr3 = this.f23464e;
        LinkedHashMap linkedHashMap = this.f23502f;
        List<Object> listA = vVar.a(bArr2, bArr3, (byte[][]) linkedHashMap.get("Subrs"), true);
        String str2 = this.f23460a;
        LinkedHashMap linkedHashMap2 = this.f23461b;
        Object obj = linkedHashMap2.get("defaultWidthX");
        if (obj == null) {
            obj = linkedHashMap.get("defaultWidthX");
        }
        Number number = (Number) obj;
        int iIntValue = number == null ? DescriptorProtos.Edition.EDITION_2023_VALUE : number.intValue();
        Object obj2 = linkedHashMap2.get("nominalWidthX");
        if (obj2 == null) {
            obj2 = linkedHashMap.get("nominalWidthX");
        }
        Number number2 = (Number) obj2;
        u uVar2 = new u(this.f23504h, str2, str, listA, iIntValue, number2 != null ? number2.intValue() : 0);
        concurrentHashMap.put(Integer.valueOf(i10), uVar2);
        return uVar2;
    }
}
