$watcher = New-Object System.IO.FileSystemWatcher
$watcher.Path = Get-Location
$watcher.IncludeSubdirectories = $true
$watcher.EnableRaisingEvents = $true

Write-Host "Watching for changes..."

$action = {
    Start-Sleep -Seconds 2  # Avoid multiple rapid commits
    git add .
    git commit -m "A $(Get-Date -Format 'yyyy-MM-dd HH:mm:ss')"
    git push origin main
    Write-Host "Changes pushed to GitHub!"
}

Register-ObjectEvent $watcher "Changed" -Action $action
Register-ObjectEvent $watcher "Created" -Action $action
Register-ObjectEvent $watcher "Deleted" -Action $action

while ($true) { Start-Sleep -Seconds 2000 }  # Keep script running
