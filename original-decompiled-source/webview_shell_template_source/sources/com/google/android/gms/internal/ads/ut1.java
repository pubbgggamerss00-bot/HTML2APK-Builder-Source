package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ut1 implements ys1 {

    /* renamed from: a, reason: collision with root package name */
    public final eu f9631a;

    public ut1(eu euVar) throws GeneralSecurityException {
        this.f9631a = euVar;
        if (((jx1) euVar.f4397v).f6189a.isEmpty()) {
            return;
        }
        Object obj = (kx1) tx1.f9412b.f9414a.get();
        obj = obj == null ? tx1.f9413c : obj;
        me0.f(euVar);
        obj.getClass();
    }

    @Override // com.google.android.gms.internal.ads.ys1
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Map map = (Map) this.f9631a.f4395t;
        if (bArr.length > 5) {
            List list = (List) map.get(r32.a(Arrays.copyOf(bArr, 5)));
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    return ((ys1) ((my1) it.next()).f7252a).e(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        List list2 = (List) map.get(r32.a(fo.F));
        if (list2 == null) {
            list2 = Collections.EMPTY_LIST;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            try {
                return ((ys1) ((my1) it2.next()).f7252a).e(bArr, bArr2);
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
