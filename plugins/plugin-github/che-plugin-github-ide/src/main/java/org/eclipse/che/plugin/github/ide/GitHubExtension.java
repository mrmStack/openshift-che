/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.plugin.github.ide;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.che.ide.api.extension.Extension;
import org.eclipse.che.plugin.ssh.key.client.SshKeyUploaderRegistry;

/**
 * Extension adds GitHub support to the IDE Application.
 *
 * @author Andrey Plotnikov
 */
@Singleton
@Extension(title = "GitHub", version = "3.0.0")
public class GitHubExtension {

  public static final String GITHUB_HOST = "github.com";

  @Inject
  public GitHubExtension(
      SshKeyUploaderRegistry registry, GitHubSshKeyUploader gitHubSshKeyProvider) {
    registry.registerUploader(GITHUB_HOST, gitHubSshKeyProvider);
  }
}
