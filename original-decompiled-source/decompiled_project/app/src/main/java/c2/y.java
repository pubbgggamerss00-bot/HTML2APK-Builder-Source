package c2;

import android.os.Trace;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.n1;

/* loaded from: classes.dex */
public final class y {
    public static v1.a a(n1 n1Var, int i10) {
        v1.a aVar = new v1.a(n1Var, (n1Var.getHeight() & BodyPartID.bodyIdMax) | (n1Var.a() << 32));
        aVar.f30534h = i10;
        return aVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(c2.c r8, vg.a r9) {
        /*
            boolean r0 = r9 instanceof u.h
            if (r0 == 0) goto L13
            r0 = r9
            u.h r0 = (u.h) r0
            int r1 = r0.f28890c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28890c = r1
            goto L18
        L13:
            u.h r0 = new u.h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28889b
            ug.a r1 = ug.a.f29706a
            int r2 = r0.f28890c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            c2.c r8 = r0.f28888a
            pg.q.b(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            pg.q.b(r9)
        L34:
            r0.f28888a = r8
            r0.f28890c = r3
            c2.t r9 = c2.t.f4695b
            java.lang.Object r9 = r8.C1(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            c2.r r9 = (c2.r) r9
            int r2 = r9.f4689c
            java.lang.Object r9 = r9.f4687a
            r2 = r2 & 66
            if (r2 == 0) goto L34
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r9.get(r5)
            c2.b0 r6 = (c2.b0) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f4600h
            if (r7 != 0) goto L34
            boolean r6 = r6.f4596d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L51
        L6a:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.y.b(c2.c, vg.a):java.lang.Object");
    }

    public static final g1.n e(eh.p pVar, eh.l lVar) {
        g1.a aVar = new g1.a(pVar);
        kotlin.jvm.internal.r.c(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        kotlin.jvm.internal.m0.b(1, lVar);
        g1.n nVar = g1.m.f11307a;
        return new g1.n(aVar, lVar);
    }

    public static androidx.compose.ui.d f(androidx.compose.ui.d dVar, b bVar) {
        return dVar.h(new PointerHoverIconModifierElement(bVar));
    }

    public void c(String label) {
        kotlin.jvm.internal.r.e(label, "label");
        Trace.beginSection(m6.a.c(label));
    }

    public void d() {
        Trace.endSection();
    }
}
