package j2;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.google.protobuf.DescriptorProtos;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f14837a = new o0();

    public final void a(View view, c2.x xVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = xVar instanceof c2.a ? null : xVar instanceof c2.b ? PointerIcon.getSystemIcon(context, ((c2.b) xVar).f4592b) : PointerIcon.getSystemIcon(context, DescriptorProtos.Edition.EDITION_2023_VALUE);
        if (kotlin.jvm.internal.r.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
