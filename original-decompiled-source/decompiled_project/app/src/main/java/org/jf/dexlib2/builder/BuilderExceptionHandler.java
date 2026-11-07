package org.jf.dexlib2.builder;

import org.jf.dexlib2.base.BaseExceptionHandler;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public abstract class BuilderExceptionHandler extends BaseExceptionHandler {
    protected final Label handler;

    public static BuilderExceptionHandler newExceptionHandler(final TypeReference typeReference, Label label) {
        return typeReference == null ? newExceptionHandler(label) : new BuilderExceptionHandler(label) { // from class: org.jf.dexlib2.builder.BuilderExceptionHandler.1
            @Override // org.jf.dexlib2.iface.ExceptionHandler
            public String getExceptionType() {
                return typeReference.getType();
            }

            @Override // org.jf.dexlib2.base.BaseExceptionHandler, org.jf.dexlib2.iface.ExceptionHandler
            public TypeReference getExceptionTypeReference() {
                return typeReference;
            }

            @Override // org.jf.dexlib2.iface.ExceptionHandler
            public int getHandlerCodeAddress() {
                return this.handler.getCodeAddress();
            }
        };
    }

    public Label getHandler() {
        return this.handler;
    }

    private BuilderExceptionHandler(Label label) {
        this.handler = label;
    }

    public static BuilderExceptionHandler newExceptionHandler(Label label) {
        return new BuilderExceptionHandler(label) { // from class: org.jf.dexlib2.builder.BuilderExceptionHandler.2
            @Override // org.jf.dexlib2.iface.ExceptionHandler
            public String getExceptionType() {
                return null;
            }

            @Override // org.jf.dexlib2.iface.ExceptionHandler
            public int getHandlerCodeAddress() {
                return this.handler.getCodeAddress();
            }
        };
    }

    public static BuilderExceptionHandler newExceptionHandler(final String str, Label label) {
        if (str == null) {
            return newExceptionHandler(label);
        }
        return new BuilderExceptionHandler(label) { // from class: org.jf.dexlib2.builder.BuilderExceptionHandler.3
            @Override // org.jf.dexlib2.iface.ExceptionHandler
            public String getExceptionType() {
                return str;
            }

            @Override // org.jf.dexlib2.iface.ExceptionHandler
            public int getHandlerCodeAddress() {
                return this.handler.getCodeAddress();
            }
        };
    }
}
