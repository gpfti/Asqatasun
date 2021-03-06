/*
 * Asqatasun - Automated webpage assessment
 * Copyright (C) 2008-2019  Asqatasun.org
 *
 * This file is part of Asqatasun.
 *
 * Asqatasun is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: asqatasun AT asqatasun DOT org
 */
package org.asqatasun.entity.factory.audit;

import java.util.Date;

import org.asqatasun.entity.audit.Content;
import org.asqatasun.entity.audit.ImageContent;
import org.asqatasun.entity.audit.ImageContentImpl;
import org.asqatasun.entity.audit.JavascriptContent;
import org.asqatasun.entity.audit.RelatedContent;
import org.asqatasun.entity.audit.SSP;
import org.asqatasun.entity.audit.StylesheetContent;
import org.asqatasun.entity.subject.Page;

import org.asqatasun.entity.audit.JavascriptContentImpl;
import org.asqatasun.entity.audit.RelatedContentImpl;
import org.asqatasun.entity.audit.SSPImpl;
import org.asqatasun.entity.audit.StylesheetContentImpl;

/**
 * 
 * @author jkowalczyk
 */
public class ContentFactoryImpl implements ContentFactory {

    public ContentFactoryImpl() {
        super();
    }

    @Override
    public Content create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SSP createSSP(String uri) {
        return new SSPImpl(uri);
    }

    @Override
    public SSP createSSP(String uri, Page page) {
        return new SSPImpl(uri, page);
    }

    @Override
    public SSP createSSP(Date dateOfLoading, String uri) {
        return new SSPImpl(dateOfLoading, uri);
    }

    @Override
    public SSP createSSP(Date dateOfLoading, String uri, String sourceCode,
            Page page) {
        return new SSPImpl(dateOfLoading, uri, sourceCode, page);
    }

    @Override
    public SSP createSSP(Date dateOfLoading, String uri, int httpStatusCode) {
        return new SSPImpl(dateOfLoading, uri, httpStatusCode);
    }

    @Override
    public SSP createSSP(Date dateOfLoading, String uri, String sourceCode,
            Page page, int httpStatusCode) {
        return new SSPImpl(dateOfLoading, uri, sourceCode, page, httpStatusCode);
    }

    @Override
    public StylesheetContent createStylesheetContent(
            Date dateOfLoading,
            String uri,
            SSP ssp,
            String sourceCode) {
        return new StylesheetContentImpl(dateOfLoading, uri, ssp, sourceCode);
    }

    @Override
    public StylesheetContent createStylesheetContent(String uri,SSP ssp) {
        return new StylesheetContentImpl(uri, ssp);
    }

    @Override
    public JavascriptContent createJavascriptContent(
            Date dateOfLoading,
            String uri,
            SSP ssp,
            String sourceCode) {
        return new JavascriptContentImpl(dateOfLoading, uri, ssp, sourceCode);
    }

    @Override
    public ImageContent createImageContent(
            Date dateOfLoading,
            String uri,
            SSP ssp,
            byte[] binaryContent) {
        return new ImageContentImpl(dateOfLoading, uri, ssp, binaryContent);
    }

    @Override
    public StylesheetContent createStylesheetContent(
            Date dateOfLoading,
            String uri,
            SSP ssp,
            String sourceCode,
            int httpStatusCode) {
        return new StylesheetContentImpl(dateOfLoading, uri, ssp, sourceCode, httpStatusCode);
    }

    @Override
    public JavascriptContent createJavascriptContent(
            Date dateOfLoading,
            String uri,
            SSP ssp,
            String sourceCode,
            int httpStatusCode) {
        return new JavascriptContentImpl(dateOfLoading, uri, ssp, sourceCode, httpStatusCode);
    }

    @Override
    public ImageContent createImageContent(
            Date dateOfLoading,
            String uri,
            SSP ssp,
            byte[] binaryContent,
            int httpStatusCode) {
        return new ImageContentImpl(dateOfLoading, uri, ssp, binaryContent, httpStatusCode);
    }

    @Override
    public ImageContent createImageContent(String uri, SSP ssp) {
        return new ImageContentImpl(uri, ssp);
    }

    @Override
    public RelatedContent createRelatedContent(String uri, SSP ssp) {
        return new RelatedContentImpl(uri, ssp);
    }

}
