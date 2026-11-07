package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.ws1;
import com.google.android.gms.internal.consent_sdk.w6;
import com.google.android.gms.internal.consent_sdk.z6;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class w6<MessageType extends z6<MessageType, BuilderType>, BuilderType extends w6<MessageType, BuilderType>> extends x5<MessageType, BuilderType> {
    public final z6 s;

    /* renamed from: t, reason: collision with root package name */
    public z6 f11925t;

    public w6(MessageType messagetype) {
        this.s = messagetype;
        if (messagetype.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f11925t = (z6) messagetype.f(4);
    }

    public final MessageType b() {
        MessageType messagetype = (MessageType) c();
        messagetype.getClass();
        boolean zF = true;
        byte bByteValue = ((Byte) messagetype.f(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zF = false;
            } else {
                zF = b8.f11644c.a(messagetype.getClass()).f(messagetype);
                messagetype.f(2);
            }
        }
        if (zF) {
            return messagetype;
        }
        throw new ws1("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final MessageType c() {
        if (!this.f11925t.e()) {
            return (MessageType) this.f11925t;
        }
        this.f11925t.j();
        return (MessageType) this.f11925t;
    }

    public final Object clone() {
        w6 w6Var = (w6) this.s.f(5);
        w6Var.f11925t = c();
        return w6Var;
    }

    public final void d() {
        if (this.f11925t.e()) {
            return;
        }
        z6 z6Var = (z6) this.s.f(4);
        b8.f11644c.a(z6Var.getClass()).d(z6Var, this.f11925t);
        this.f11925t = z6Var;
    }
}
