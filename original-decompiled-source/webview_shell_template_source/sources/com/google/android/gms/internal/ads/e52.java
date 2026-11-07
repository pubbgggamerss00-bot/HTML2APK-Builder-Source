package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e52;
import com.google.android.gms.internal.ads.j52;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class e52<MessageType extends j52<MessageType, BuilderType>, BuilderType extends e52<MessageType, BuilderType>> extends s32<MessageType, BuilderType> {
    public final MessageType s;

    /* renamed from: t, reason: collision with root package name */
    public MessageType f4126t;

    public e52(MessageType messagetype) {
        this.s = messagetype;
        if (messagetype.w()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4126t = (MessageType) messagetype.t();
    }

    public final Object clone() {
        e52 e52Var = (e52) this.s.x(5, null);
        e52Var.f4126t = (MessageType) h();
        return e52Var;
    }

    public final MessageType g() {
        MessageType messagetype = (MessageType) h();
        messagetype.getClass();
        if (j52.A(messagetype, true)) {
            return messagetype;
        }
        throw new l72();
    }

    public final MessageType h() {
        if (!this.f4126t.w()) {
            return this.f4126t;
        }
        this.f4126t.o();
        return this.f4126t;
    }

    public final void i() {
        if (this.f4126t.w()) {
            return;
        }
        MessageType messagetype = (MessageType) this.s.t();
        u62.f9474c.a(messagetype.getClass()).i(messagetype, this.f4126t);
        this.f4126t = messagetype;
    }
}
