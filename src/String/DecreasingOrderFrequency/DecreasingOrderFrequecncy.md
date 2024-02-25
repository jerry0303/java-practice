# My Markdown File

Lorem ipsum dolor sit amet, consectetur adipiscing elit. 

<button id="copyButton">Copy</button>

<script>
document.getElementById('copyButton').addEventListener('click', function() {
  var markdownContent = `# My Markdown File\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit.`;
  copyToClipboard(markdownContent);
});

function copyToClipboard(text) {
  var textarea = document.createElement("textarea");
  textarea.value = text;
  document.body.appendChild(textarea);
  textarea.select();
  document.execCommand('copy');
  document.body.removeChild(textarea);
  alert("Markdown content copied to clipboard!");
}
</script>



jjksdkjbasbdlasdasd