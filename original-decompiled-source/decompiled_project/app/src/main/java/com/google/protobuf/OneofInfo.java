package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes2.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id, reason: collision with root package name */
    private final int f6910id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i10, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f6910id = i10;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f6910id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
