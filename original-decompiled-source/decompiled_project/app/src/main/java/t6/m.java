package t6;

import android.database.Cursor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import k3.d;
import m9.t0;
import ph.k0;
import ph.s1;
import r9.h;
import y9.l;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements d.c, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f28037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28038c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(tg.h hVar, k0 k0Var, eh.p pVar) {
        this.f28036a = hVar;
        this.f28037b = k0Var;
        this.f28038c = (vg.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eh.p, vg.i] */
    @Override // k3.d.c
    public Object a(d.a aVar) {
        tg.h hVar = (tg.h) this.f28036a;
        k0 k0Var = (k0) this.f28037b;
        ?? r22 = (vg.i) this.f28038c;
        t0 t0Var = new t0((s1) hVar.get(s1.a.f21589a), 1);
        k3.h<Void> hVar2 = aVar.f15968c;
        if (hVar2 != null) {
            hVar2.a(t0Var, h.f28020a);
        }
        return ph.h.c(ph.j0.a(hVar), null, k0Var, new q(r22, aVar, null), 1);
    }

    /* JADX WARN: Finally extract failed */
    @Override // y9.l.a
    public Object apply(Object obj) {
        y9.l lVar;
        y9.l lVar2 = (y9.l) this.f28036a;
        ArrayList arrayList = (ArrayList) this.f28037b;
        r9.j jVar = (r9.j) this.f28038c;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            h.a aVar = new h.a();
            aVar.f23285f = new HashMap();
            String string = cursor.getString(1);
            if (string == null) {
                throw new NullPointerException("Null transportName");
            }
            aVar.f23280a = string;
            aVar.f23283d = Long.valueOf(cursor.getLong(2));
            aVar.f23284e = Long.valueOf(cursor.getLong(3));
            if (z10) {
                String string2 = cursor.getString(4);
                aVar.f23282c = new r9.m(string2 == null ? y9.l.f34338f : new o9.b(string2), cursor.getBlob(5));
                lVar = lVar2;
            } else {
                String string3 = cursor.getString(4);
                o9.b bVar = string3 == null ? y9.l.f34338f : new o9.b(string3);
                Cursor cursorQuery = lVar2.E().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    int length = 0;
                    while (cursorQuery.moveToNext()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        arrayList2.add(blob);
                        length += blob.length;
                    }
                    byte[] bArr = new byte[length];
                    int i10 = 0;
                    int length2 = 0;
                    while (i10 < arrayList2.size()) {
                        byte[] bArr2 = (byte[]) arrayList2.get(i10);
                        y9.l lVar3 = lVar2;
                        System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                        length2 += bArr2.length;
                        i10++;
                        lVar2 = lVar3;
                    }
                    lVar = lVar2;
                    cursorQuery.close();
                    aVar.f23282c = new r9.m(bVar, bArr);
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!cursor.isNull(6)) {
                aVar.f23281b = Integer.valueOf(cursor.getInt(6));
            }
            arrayList.add(new y9.b(j10, jVar, aVar.b()));
            lVar2 = lVar;
        }
        return null;
    }

    public /* synthetic */ m(y9.l lVar, ArrayList arrayList, r9.j jVar) {
        this.f28036a = lVar;
        this.f28037b = arrayList;
        this.f28038c = jVar;
    }
}
