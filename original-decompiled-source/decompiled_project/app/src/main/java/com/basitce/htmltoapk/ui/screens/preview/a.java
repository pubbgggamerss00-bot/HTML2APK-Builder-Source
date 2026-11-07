package com.basitce.htmltoapk.ui.screens.preview;

import android.view.GestureDetector;
import android.view.MotionEvent;
import b9.v;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5811a;

    public a(v vVar) {
        this.f5811a = vVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e10) {
        r.e(e10, "e");
        this.f5811a.invoke();
        return false;
    }
}
